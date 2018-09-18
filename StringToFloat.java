/**
 *
 * @author chienhungsu
 */
public class StringToFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sample input string1
        String input="+123467.1";
        // sample input string1
        String a="-123467.1";
        // sample input string1
        String b="123467";
                // sample input string1
        String c="0.11233";
        String d=null;
        String e="";
        //call convert method
        convert(input);
        convert(a);
        convert(b);
        convert(c);
        convert(d);
        convert(e);
    }
    /*
        convert string to float
        parameter: input
        output: float value
    */
    private static void convert(String input) {
        // output for print, temp for each digit, and part for partial number
        float output=0,temp=0,part=0;
        // num for partial number
        int num=1;
        // positive is for confirming positive or negative
        // point is for checking whether the string is including the partial number or not
        // wrong is for checking the string can be convert to float or not
        boolean positive=true,point=false,wrong=false;
        //confirm that the input is not null
        if(input==null||input.length()==0){
            System.out.println("Input non-valid");
        }else{
            for(int i=0;i<input.length();i++){
                if(!wrong){
                    char c=input.charAt(i);
                    switch (c){
                        case '1':temp=1;
                            break;
                        case '2':temp=2;
                            break;
                        case '3':temp=3;
                            break;
                        case '4':temp=4;
                            break;
                        case '5':temp=5;
                            break;
                        case '6':temp=6;
                            break;
                        case '7':temp=7;
                            break;
                        case '8':temp=8;
                            break;
                        case '9':temp=9;
                            break;
                        case '0':temp=0;
                            break;
                        case '-':temp=0;positive=false;
                            break;
                        case '+':temp=0;
                            break;
                        case '.':temp=0;point=true;
                            break;
                        default: wrong=true;
                            break;
                    }
                    //point condition is to deal with int part
                    if(!point){
                        output=10*output+temp;
                    }else{
                        // !point is to deal with partial part
                        if(c!='.'){
                            num=num*10;
                            part=part+temp/num;
                            System.out.println(part);
                        }
                    }

                }

            }
            // wrong condition is to check input is a valid number for converting
            if(wrong){
                System.out.println("Input non-valid");
            }else{
                output=part+output;
                if(!positive)output*=-1;
                System.out.println(output);
            }
        }


    }

}
