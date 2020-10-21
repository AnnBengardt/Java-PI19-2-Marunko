package command.undo;

public class Invoker {

    private Command undoCommand;

    public Invoker(Command undoCommand){
        this.undoCommand = undoCommand;
    }

    public void undo(){
        undoCommand.execute();
    }

}
