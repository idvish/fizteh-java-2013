package ru.fizteh.fivt.students.asaitgalin.filemap;

import ru.fizteh.fivt.storage.strings.Table;
import ru.fizteh.fivt.students.asaitgalin.shell.Command;

import java.io.IOException;

public class RemoveCommand implements Command {
    private Table storage;

    public RemoveCommand(Table storage) {
        this.storage = storage;
    }

    @Override
    public String getName() {
        return "remove";
    }

    @Override
    public void execute(String[] args) throws IOException {
        String value = storage.remove(args[1]);
        if (value != null) {
            System.out.println("removed");
        } else {
            System.out.println("not found");
        }
    }

    @Override
    public int getArgsCount() {
        return 1;
    }
}
