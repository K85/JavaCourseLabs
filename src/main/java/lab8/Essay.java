package lab8;

public class Essay extends TestQuestion {

    private int blankLinesForAnswerSpace;

    @Override
    protected void readQuestion() {
        this.blankLinesForAnswerSpace = Integer.parseInt(scanner.nextLine());
        super.question = scanner.nextLine();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Question: ");
        sb.append(question);

        for(int i = 0; i < blankLinesForAnswerSpace; i++)
            sb.append("\n");
        return sb.toString();
    }
}
