class Hangman {

  private final char[] answer;
  private final char[] hiddenAnswer;
  private final Output output;

  @SuppressWarnings("ReplaceAllDot")
  Hangman(String answer, Output output) {
    this.answer = answer.toCharArray();
    this.hiddenAnswer = answer.replaceAll(".", "_").toCharArray();
    this.output = output;
  }

  boolean guess(char guess) {
    var correctGuess = false;
    for (int i = 0; i < answer.length; i++) {
      if (guess == answer[i]){
        hiddenAnswer[i] = guess;
        correctGuess = true;
      }
    }

    output.print(hiddenAnswer);
    return correctGuess;
  }
}
