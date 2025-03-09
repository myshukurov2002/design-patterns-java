package behavioral.memento;

public class Main {
    public static void main(String[] args) {
            TextEditor editor = new TextEditor();
            History history = new History();
            editor.write("salom");
        editor.write("ali");
        history.saveState(editor);
        editor.write("qale");
        history.saveState(editor);

        editor.write(" Mazgi");
        history.saveState(editor);
        editor.write(" sana");
        history.saveState(editor);

        System.out.println(editor.getText());
        history.undo(editor);
        System.out.println(editor.getText());
        history.undo(editor);
        System.out.println(editor.getText());
        history.undo(editor);
        System.out.println(editor.getText());
        history.undo(editor);
        System.out.println(editor.getText());



    }
}
