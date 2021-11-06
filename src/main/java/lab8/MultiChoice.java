package lab8;

import java.util.ArrayList;

public class MultiChoice extends TestQuestion {

    private final ArrayList<String> options = new ArrayList<>();

    @Override
    protected void readQuestion() {

        int optionsAmount = Integer.parseInt(scanner.nextLine());
        super.question = scanner.nextLine();

        for (int i = 0; i < optionsAmount; i++) {
            options.add(scanner.nextLine());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.question);
        sb.append("\n");

        for (int i = 0; i < options.size(); i++) {
            sb.append((char) (97 + i) + ") " + options.get(i) + "\n");
        }

        return sb.toString();
    }
}
