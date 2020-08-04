import java.util.*;
import java.io.*;


class MusicSaver
{

// - Variables - //


    // File
    PrintWriter fileOutput;


// - Alternate Constructor - //


    public MusicSaver( String inFilePath ) throws IOException
    {
        fileOutput = new PrintWriter( new BufferedWriter( new FileWriter( inFilePath, true ) ) );
    }


// - Add Songs to 'NewMusic.txt' - //


    public void addSongs( LinkedList<String> inSongs ) throws IOException
    {
        for ( String song : inSongs )
        {
            song = formatTitle( song );
            fileOutput.println( song );
        }
    }


// - Close File Output - //

    public void close()
    {
        fileOutput.close();
    }


// - Private Methods - //

    // Get rid of any unwanted characters in song titles
    private String formatTitle( String inTitle )
    {
        return inTitle.replace( "\\u0026", "" );
    }

}