import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryMonitor {
    static void usage() {
        System.err.println("usage: java DirectoryMonitor [-r] dir find replace");
        System.err.println("patten for visa: \\b4[0-9]{15}\\b");
        System.err.println("patten for phone: \\b[1-9][0-9]{2}-[0-9]{3}-[0-9]{4}\\b");        
        System.exit(-1);
    }

    public static void main(String[] args) throws IOException {
        // parse arguments
        if (args.length < 3 || args.length > 4)
            usage();
        boolean recursive = false;
        int dirArg = 0;
        if (args[0].equals("-r")) {
            if (args.length < 4)
                usage();
            recursive = true;
            dirArg++;
        }

        // register directory and process its events
        Path dir = Paths.get(args[dirArg]);
        String find = args[dirArg+1];
        String replace = args[dirArg+2];
        new WatchDir(dir, recursive).processEvents(find,replace);
    }
}