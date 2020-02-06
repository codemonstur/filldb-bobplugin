package bobfilldb;

import bobthebuildtool.pojos.buildfile.Project;
import bobthebuildtool.pojos.internal.DescriptionAndInterface;

public enum Main {;

    public static void installPlugin(final Project project) {
        project.commands.put("ben", new DescriptionAndInterface<>("Runs ben the manager"
            , (project1, environment, args) -> {
            filldb.Main.main(args);
            return 0;
        }));
    }

}
