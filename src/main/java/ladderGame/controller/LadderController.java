package ladderGame.controller;

import ladderGame.service.GamePlay;
import ladderGame.view.InputView;
import ladderGame.view.PrintView;

public class LadderController {

  private static final String MSG_INSERT_PLAYER_NAMES = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
  private static final String MSG_INSERT_HEIGHT = "최대 사다리 높이는 몇 개인가요?";

  public static void main(String[] args) {

    String stringNames = InputView.inputUserNamesWithMessage(MSG_INSERT_PLAYER_NAMES);
    int height = InputView.inputLadderHeightWithMessage(MSG_INSERT_HEIGHT);

    GamePlay gamePlay = new GamePlay(stringNames, height);

    PrintView.printUsersName(gamePlay.getPlayer());
    PrintView.createLadderView(gamePlay.getLines());
  }
}