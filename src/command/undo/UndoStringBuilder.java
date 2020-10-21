package command.undo;

import java.util.Stack;

public class UndoStringBuilder {

    private StringBuilder stringBuilder;
    private Stack<Command> commands = new Stack<>();

    public UndoStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public UndoStringBuilder append(String str){
        int len = stringBuilder.length();
        stringBuilder.append(str);
        Command command = new Command() {
            @Override
            public void execute() {
                stringBuilder.delete(len, stringBuilder.length()-1);
            }
        };
        commands.add(command);
        return this;
    }

    public UndoStringBuilder delete(int start, int end){
        String deletedString = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        Command command = new Command() {
            @Override
            public void execute() {
                stringBuilder.insert(start, deletedString);
            }
        };
        commands.add(command);
        return this;
    }

    public UndoStringBuilder deleteCharAt(int index){
        Character deletedChar = stringBuilder.charAt(index);
        stringBuilder.deleteCharAt(index);
        Command command = new Command() {
            @Override
            public void execute() {
                stringBuilder.insert(index, deletedChar);
            }
        };
        commands.add(command);
        return this;
    }

    public UndoStringBuilder insert(int start, String str){
        stringBuilder.insert(start, str);
        Command command = new Command() {
            @Override
            public void execute() {
                stringBuilder.delete(start, start + str.length());
            }
        };
        commands.add(command);
        return this;
    }

    public String toString(){
        return stringBuilder.toString();
    }

    public Integer length(){
        return stringBuilder.length();
    }

    public void undo(){
        if (!commands.isEmpty()){
            commands.pop().execute();
        }
    }

}
