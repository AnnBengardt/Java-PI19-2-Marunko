package command.undo;

public class UndoCommand implements Command {

    private UndoStringBuilder undoStringBuilder;

    public UndoCommand(UndoStringBuilder undoStringBuilder){
        this.undoStringBuilder = undoStringBuilder;
    }

    @Override
    public void execute() {
        this.undoStringBuilder.undo();
    }
}
