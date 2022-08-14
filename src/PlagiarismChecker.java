import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PlagiarismChecker{  
    static ArrayList<String> bd= new ArrayList<String>();
    //static ArrayList<ArrayList> list= new ArrayList<ArrayList>();

    public static void main(String[] args){
        PlagiarismChecker nom = new PlagiarismChecker();
        String r= "D:\\Semestre_3\\Estructura_de_Datos_Algoritmos\\Proyecto\\EDA_Proyecto\\Bdatos\\texto+.txt";
        String[] paths= new String[4];
        for(int i=1; i<= 4; i++){
            paths[i-1]= r.replace("+", i+"");
        }
        nom.loadFiles(paths);
         System.out.println(bd.toString());
    }

    public boolean loadFiles(String[] paths){
        String line;
        for(String path: paths){
            try {
                Scanner lector= new Scanner(new FileReader(path));
                /*while(lector.hasNextLine()) {
                    line= lector.next();
                    line= line.replace(",","");
                    bd.add(line);            
                }
                lector.close();          */  
                line= lector.next();
                bd.add(line); // Pruebo extrayendo la primera palabra de cada texto de la bd
            }
            catch (FileNotFoundException e){
                System.out.print("Error");
                return false;
            }
        }
        return false;
    }

    public ResultChecker verifyPlagiarism(String path){
        ResultChecker obj= null;
        
        return obj;
    }
}