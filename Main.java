import java.io.Console;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {

    public static void main(String[] args) {


        CurrentFile curFil = openFile( args.length>0 ? args[0] : "./Directory/exampleFile4.txt");//"./Directory/exampleFile4.txt" );

        // Console cnsl = System.console();
        // System.out.println(cnsl.readPassword(""));

        UI.clear();
// getValues();
        curFil.printFile();
        for (int i = 0; i < curFil.getListSize(); i++) {
            UI.moveCU();
        }
        int exitCode;//NotSet
        exitCode = curFil.editFile();
        if(exitCode==5)
            curFil.writeFile();//Save

        UI.clear();
        System.out.print("````````````````");
    }

    static private void getValues(){
        while(true){
            UI.getChrNumFromPress();
        }
    }

    private static CurrentFile openFile(String fileLocaton_){

        CurrentFile openedFile = new CurrentFile(fileLocaton_);
        return openedFile;
    }

    private static int makeFile(){
        return 0;
    }

}
