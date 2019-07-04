package attempt;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import exercise.Output;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HangmanTest {

  private Hangman hangman;

  @Mock
  private Output mockOutput;

  @BeforeEach
  void init(){
    hangman = new Hangman("test", mockOutput);
  }

  @Test
  void whenALetterIsGuessedIncorrectlyThenGuessIsUnsuccessful(){
    assertFalse(hangman.guess('x'));
    verify(mockOutput, times(1)).print(new char[]{'_', '_', '_', '_'});
    reset(mockOutput);

    assertTrue(hangman.guess('t'));
    verify(mockOutput, times(1)).print(new char[]{'t', '_', '_', 't'});
    reset(mockOutput);

    assertTrue(hangman.guess('e'));
    verify(mockOutput, times(1)).print(new char[]{'t', 'e', '_', 't'});
    reset(mockOutput);

    assertFalse(hangman.guess('x'));
    verify(mockOutput, times(1)).print(new char[]{'t', 'e', '_', 't'});
    reset(mockOutput);

    assertTrue(hangman.guess('s'));
    verify(mockOutput, times(1)).print(new char[]{'t', 'e', 's', 't'});
  }
}
