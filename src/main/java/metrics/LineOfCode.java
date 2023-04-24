package metrics;

import org.sonar.api.batch.fs.InputFile;

public class LineOfCode {

    public static int getLOC(InputFile file){
        return file.lines();
    }

    public static int getNCLOC(InputFile file){
        //TODO: Calculate the LOC without comments
        return file.lines();
    }

}
