/**Parser object: solves any expression with parentheses and trigonometric and algebraic functions (i.e sin,cos,tan,log,absolute...etc) no matter the complexity
*Also includes constants e and π (each with 16 digits of precision), and variable x
*@author Mohammad Adib
*@version 9
*/
import java.util.LinkedList;
import java.text.DecimalFormat;

public class Parser
{
   private String input,output,converted,Precision_str;
   private int
   //precision (maximum amount of digits after decimal place)
   precision=16,
   //Mode radian(1) or degree(2)
   mode=1;
   private double xValue,
   //LOG base (default is 10)
   logBase=10;
   private final char

   //------------------------
   //Characters of constants:
   pi='p',
   e='e',
   //Characters of functions:
   sin='s',
   cos='c',
   tan='t',
   log='l',
   sqr='q',
   exp='^',
   abs='a',
   asin='S',
   acos='C',
   atan='T',
   csc='P',
   sec='Q',
   cot='R',
   //Characters of variables:
   x='x';
   //------------------------

   //constructor for ExpressionReader Object
   public Parser()
   {
       setPrecision(precision);
       setLogBase(logBase);
       setMode(mode);
   }
   //solve the expression
   public String solve(String expression,Double x)
   {
       input=expression;
       xValue=x;
       //cleanse input
       purify();
       //remove parentheses
       removePars();
       //return final result
       output=toString(evaluate(input+"="));
       return output;
   }
   //throw out parentheses
   private void removePars()
   {
       try{
       String inPars;
       boolean foundEndPars=false;
       int beginPars=0, endPars=0;
       while(beginPars!=-1&&endPars!=-1)
       {
           foundEndPars=false;
           beginPars=input.indexOf("(");
           endPars=beginPars;
           if (beginPars!=-1)
           {
           while(foundEndPars==false)
           {
               endPars++;
               switch(input.charAt(endPars))
               {
                   case '(':
                       beginPars=endPars;
                       break;
                   case ')':
                       foundEndPars=true;
                       break;
               }
           }
           inPars=input.substring(beginPars+1,endPars);
           //evaluate stuff in parentheses
           input=input.substring(0,beginPars)+evaluate(inPars+"=")+input.substring(endPars+1,input.length());
           //take care of --number resulting from -(number-biggerNumber)
           noMultipleNegatives();
           }
       }
       }catch(Exception e)
       {
           input="NaN";
       }
   }
   //close parentheses if needed
   private void addPars()
   {
	   int beginParCount=0, endParCount=0;
	   for (int i=0;i<input.length();i++)
	   {
               switch (input.charAt(i))
		{
		case '(':
                    beginParCount+=1;
                    break;
		case ')':
                    endParCount+=1;
                    break;
		}
	   }
	   if (endParCount<beginParCount)
	   {
               for (int i=0;i<(beginParCount-endParCount);i++)
               {
                   input+=")";
	       }
	   }
   }
   //get result of stuff inside parentheses
   private double evaluate(String expression)
   {
       try{
	   //Check it's not Infinity
	   if (expression.indexOf("Infinity")!=-1)
	   {return 1/0.0;}
	   //Check it's not Nonreal
	   if (expression.indexOf("NaN")!=-1)
	   {return Math.sqrt(-1);}
       int i=0; char index; String Num="";
       LinkedList<Double> Nums = new LinkedList<Double>();
       LinkedList<Character> Ops = new LinkedList<Character>();
       //decode expression
       do
       {
           index=expression.charAt(i);
           i++;
           switch (index)
           {
               //if it's a number or decimal:
               case '0':
               case '1':
               case '2':
               case '3':
               case '4':
               case '5':
               case '6':
               case '7':
               case '8':
               case '9':
               case '.':
               case sin:
               case cos:
               case tan:
               case log:
               case sqr:
               case abs:
               case asin:
               case acos:
               case atan:
               case cot:
               case csc:
               case sec:
               case 'E':
                   Num+=index;
                   break;
               //if it's an operator:
               case '+':
               case '-':
               case '*':
               case '/':
               case exp:
                   if (Num.length()!=0&&confirmNegative(Num,expression,i))
                   {
                       Nums.add(parseNumber(Num));
                       Num="";
                       Ops.add(index);
                   }else{
                       if (index=='-')
                       Num+='-';
                   }
                   break;
               //if it reached the end:
               case '=':
                   Nums.add(parseNumber(Num));
           }
       }while(i<expression.length());

       //compute result;
       double result=Nums.get(0);
       Nums.remove(0);
       for (char a:Ops)
       {
           switch (a)
           {
               case '+':
                   result+=Nums.get(0);
                   Nums.remove(0);
                   break;
               case '-':
                   result-=Nums.get(0);
                   Nums.remove(0);
                   break;
               case '*':
                   result*=Nums.get(0);
                   Nums.remove(0);
                   break;
               case '/':
                   result/=Nums.get(0);
                   Nums.remove(0);
                   break;
               case exp:
                   result=Math.pow(result,Nums.get(0));
                   Nums.remove(0);
                   break;
           }
       }
       DecimalFormat DForm = new DecimalFormat(getPrecisionString());
       result=Double.valueOf(DForm.format(result));
       return result;
       }catch(Exception e)
       {
           return Math.sqrt(-1);
       }
   }
   //parseNumber...parseDouble does not suffice :P
   private double parseNumber(String Num)
   {
       double result=0;
       DecimalFormat DForm = new DecimalFormat(getPrecisionString());
       try{
       switch(Num.charAt(0))
       {
           //negative inside sin, cos, tan, log, ...etc
           case '-':
               result=negativeFunction(Num);
               break;
           case sin:
               Num=Num.substring(1,Num.length());
               result=Math.sin(Double.parseDouble(Num));
               if(mode==2)
               {
                   result=Math.sin((Double.parseDouble(Num))/(180/Math.PI));
               }
               break;
           case cos:
               Num=Num.substring(1,Num.length());
               result=Math.cos(Double.parseDouble(Num));
               if(mode==2)
               {
                   result=Math.cos((Double.parseDouble(Num))/(180/Math.PI));
               }
               break;
           case tan:
               Num=Num.substring(1,Num.length());
               result=Math.tan(Double.parseDouble(Num));
               if(mode==2)
               {
                   result=Math.tan((Double.parseDouble(Num))/(180/Math.PI));
               }
               break;
           case log:
               Num=Num.substring(1,Num.length());
               result=Math.log(Double.parseDouble(Num))/Math.log(logBase);
               break;
           case sqr:
               Num=Num.substring(1,Num.length());
               result=Math.sqrt(Double.parseDouble(Num));
               break;
           case abs:
               Num=Num.substring(1,Num.length());
               result=Math.abs(Double.parseDouble(Num));
               break;
           case asin:
               Num=Num.substring(1,Num.length());
               result=Math.asin(Double.parseDouble(Num));
               if(mode==2)
               {
                   result=Math.asin(Double.parseDouble(Num))*(180/Math.PI);
               }
               break;
           case acos:
               Num=Num.substring(1,Num.length());
               result=Math.acos(Double.parseDouble(Num));
               if(mode==2)
               {
                   result=Math.acos(Double.parseDouble(Num))*(180/Math.PI);
               }
               break;
           case atan:
               Num=Num.substring(1,Num.length());
               result=Math.atan(Double.parseDouble(Num));
               if(mode==2)
               {
                   result=Math.atan(Double.parseDouble(Num))*(180/Math.PI);
               }
               break;
           case csc:
               Num=Num.substring(1,Num.length());
               result=1/Math.sin(Double.parseDouble(Num));
               if(mode==2)
               {
                   result=1/Math.sin((Double.parseDouble(Num))/(180/Math.PI));
               }
               break;
           case sec:
               Num=Num.substring(1,Num.length());
               result=1/Math.cos(Double.parseDouble(Num));
               if(mode==2)
               {
                   result=1/Math.cos((Double.parseDouble(Num))/(180/Math.PI));
               }
               break;
           case cot:
               Num=Num.substring(1,Num.length());
               result=1/Math.tan(Double.parseDouble(Num));
               if(mode==2)
               {
                   result=1/Math.tan((Double.parseDouble(Num))/(180/Math.PI));
               }
               break;
           default:
               result=Double.parseDouble(Num);
               break;
       }
       result=Double.valueOf(DForm.format(result));
       }
       catch(Exception e)
       {
          return Math.sqrt(Double.parseDouble("-1"));
       }
       return result;
   }
   //detect negative functions -sin(x)...etc
   private double negativeFunction(String Num)
   {
       double result=0;
       switch (Num.charAt(1))
               {
                   case sin:
                   case cos:
                   case tan:
                   case log:
                   case sqr:
                   case abs:
                   case asin:
                   case acos:
                   case atan:
                   case cot:
                   case csc:
                   case sec:
                       Num=""+parseNumber(Num.substring(1,Num.length()))*-1;
                       result=Double.parseDouble(Num);
                       break;
                   default:
                       result=Double.parseDouble(Num);
                       break;
               }
       return result;
   }
   //detect negatives inside functions... sin(-1)...etc
   private boolean confirmNegative(String Num,String expression,int i)
   {
        boolean result=false;if
       (expression.charAt(i-2)!=sin&&
        expression.charAt(i-2)!=cos&&
        expression.charAt(i-2)!=tan&&
        expression.charAt(i-2)!=log&&
        expression.charAt(i-2)!=sqr&&
        expression.charAt(i-2)!=abs&&
        expression.charAt(i-2)!=asin&&
        expression.charAt(i-2)!=acos&&
        expression.charAt(i-2)!=atan&&
        expression.charAt(i-2)!=csc&&
        expression.charAt(i-2)!=sec&&
        expression.charAt(i-2)!=cot&&
        expression.charAt(i-2)!='E')
        {
            result=true;
        }
        return result;
    }
   //add * signs before parentheses
   private void addTimesChar()
   {
       int i=0;char index,lastItem='X';
       do
       {
           index=input.charAt(i);
           i++;
           switch (index)
           {
               //if it's a number or decimal:
               case '0':
               case '1':
               case '2':
               case '3':
               case '4':
               case '5':
               case '6':
               case '7':
               case '8':
               case '9':
               case '.':               
                   if(lastItem==')') {
                       input=input.substring(0,i-1)+"*"+input.substring(i-1,input.length());
                       i++;
                   }
                   lastItem='N';
                   break;
               //if it's an operator:
               case '+':
               case '-':
               case '*':
               case '/':
               case exp:
                   lastItem='O';
                   break;
               case '(':
               case sin:
               case cos:
               case tan:
               case log:
               case sqr:
               case abs:
               case asin:
               case acos:
               case atan:
               case cot:
               case csc:
               case sec:
                   if (lastItem=='N'||lastItem==')')
                   {
                       input=input.substring(0,i-1)+"*"+input.substring(i-1,input.length());
                       i++;lastItem='X';
                   }
                   break;
               case ')':
                   lastItem=')';
                   break;
           }
       }while(i<input.length());
   }
   private void removeConstantsandVars()
   {
       int i=0;char index,lastItem='X';
       try{
       do
       {
           index=input.charAt(i);
           i++;
           switch (index)
           {
               //if it's a number or decimal:
               case '0':
               case '1':
               case '2':
               case '3':
               case '4':
               case '5':
               case '6':
               case '7':
               case '8':
               case '9':
               case '.':
                   if (lastItem=='C')
                   {
                       input=input.substring(0,i-1)+"*"+input.substring(i-1,input.length());
                       i++;
                   }
                   lastItem='N';
                   break;
               //if it's an operator:
               case '+':
               case '-':
               case '*':
               case '/':
               case exp:
                   lastItem='O';
                   break;
               case pi:
               case e:
               case x:
                   if (lastItem=='N')
                   {
                       input=input.substring(0,i-1)+"*"+input.substring(i-1,input.length());
                       i++;
                   }
                   lastItem='C';
                   break;
           }
       }while(i<input.length());
           //replace Constants with their correspoding numbers
	   input=input.replace(Character.toString(pi),"3.141592653589793");
	   input=input.replace(Character.toString(e),"2.718281828459045");
           //Replace sequences of Xs. ie xxx => x*x*x
           for(int k=0; k<2; k++)
           input=input.replaceAll("xx", "x*x");           
           //replace x with its value
           input=input.replace(Character.toString(x),Double.toString(xValue));           
       }catch(Exception e)
       {
	   input="NaN";
       }
   }
   //remove all multiple and nested negative signs. example: --------2 yields 2.0
    private void noMultipleNegatives()
   {
        char index;        
        int minusCount=0;
        for (int i=0;i<input.length();i++)
        {
            index=input.charAt(i);
            switch (index)
            {
                case '-':
                    minusCount++;
                    if (minusCount>1)
                    {
                        input=input.replace("--","+");
                        input=input.replace("-(-","+");
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '.':
                case sin:
                case cos:
                case tan:
                case log:
                case sqr:
                case abs:
                case asin:
                case acos:
                case atan:
                case cot:
                case csc:
                case sec:
                case pi:
                case e:
                case x:
                    minusCount=0;
            }
        }
    }
   private String toString(double number)
   {
	   String result="";
	   if (Double.toString(number).equals("NaN")||Double.toString(number).equals("Infinity"))
	   {
		   result="Error";
	   }else{
		   result=Double.toString(number);
                   //if it's an integer, remove ".0"
                   if (result.substring(result.length()-2,result.length()).equals(".0"))
                   {
                       result=result.substring(0,result.length()-2);
                   }
                   //get rid of negative zero
                   if (result.equals("-0"))
                   {
                       result="0";
                   }
	   }
	   return result;
   }   
   private void purify()
   {
       convert();
       noMultipleNegatives();
       addPars();
       removeConstantsandVars();
       addTimesChar();
       noMultipleNegatives();
   }
   private void convert()
   {
       input=input.replace(" ","");
       input=input.replace(")x",")*x");
       input=input.replace("asin(","S(");
       input=input.replace("acos(","C(");
       input=input.replace("atan(","T(");
       input=input.replace("sin(","s(");
       input=input.replace("cos(","c(");
       input=input.replace("tan(","t(");
       input=input.replace("log(","l(");
       input=input.replace("csc(","P(");
       input=input.replace("sec(","Q(");
       input=input.replace("cot(","R(");
       input=input.replace("abs(","a(");
       input=input.replace("π","p");
       input=input.replace("√","q");       
   }
   public void setMode(int M)
   {
        if (M==2||M==1)
        {
            mode=M;
        }else{
            mode=1;
        }
    }
   public int getMode()
   {
       return mode;
    }
   public void setPrecision(int prec)
   {
        String result="#.";
        if (prec>0&&prec<17)
        {
        precision=prec;
        for (int i=0;i<precision;i++)
        {
            result+="#";
        }
        Precision_str=result;
        }
    }
   public int getPrecision()
   {
        return precision;
    }
   private String getPrecisionString()
   {
        setPrecision(precision);
        return Precision_str;
    }
   public void setLogBase(double lb)
   {
        logBase=lb;
    }
   public double getLogBase()
   {
        return logBase;
   }
}