package command.undo;

public class TestCommand {

    public static void main(String[] args){
        UndoStringBuilder undoStr = new UndoStringBuilder();
        Command undoCommand = new UndoCommand(undoStr);
        Invoker undo = new Invoker(undoCommand);
        undoStr.append("hello, world!");
        undoStr.insert(7, "cat");
        System.out.println(undoStr.toString());
        undoStr.delete(10, undoStr.length());
        System.out.println(undoStr.toString());
        undo.undo();
        System.out.println(undoStr.toString());
        undo.undo();
        System.out.println(undoStr.toString());
    }

}
