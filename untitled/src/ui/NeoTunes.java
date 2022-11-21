package ui;
import model.NeoTunesManager;
import java.util.Scanner;
public class NeoTunes {
    public static Scanner scanner = new Scanner(System.in);
    private NeoTunesManager manager;
    public NeoTunes(){
        createNeoTunes();
    }
    public static void main (String[] args){
        NeoTunes neoTunes = new NeoTunes();
        boolean val=false;

    }
        System.out.println(manager.getTunes());
}
