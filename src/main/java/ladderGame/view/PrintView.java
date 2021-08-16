package ladderGame.view;

import java.util.stream.Collectors;
import ladderGame.model.Line;
import ladderGame.model.Lines;
import ladderGame.model.Players;

public class PrintView {

  private static final String STRING_FORMAT_SIZE = "%6s";

  private static final String HAVING_CONNECTION = "-----|";

  private static final String NONE_CONNECTION = "|";

  public static void printUsersName(final Players players) {
    printResultTitle();
    System.out.println(players.toList()
        .stream()
        .map(player -> String.format(STRING_FORMAT_SIZE, player.getName()))
        .collect(Collectors.joining()));
  }

  private static void printResultTitle() {
    System.out.println();
    System.out.println("실행결과");
    System.out.println();
  }

  public static void createLadderView(final Lines lines) {
    lines.getLines()
        .stream()
        .map(PrintView::printLineData)
        .forEach(System.out::println);
  }

  private static String printLineData(final Line line) {
    return line.getPoints()
        .stream()
        .map(PrintView::printLine)
        .collect(Collectors.joining());
  }

  private static String printLine(final Boolean point) {
    if (point) {
      return String.format(STRING_FORMAT_SIZE, HAVING_CONNECTION);
    }
    return String.format(STRING_FORMAT_SIZE, NONE_CONNECTION);
  }
}