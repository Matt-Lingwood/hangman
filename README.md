# Hangman

## Task

You are required to work out whether a guessed letter is correct and 
then reveal the remaining letters to guess of a given word.

### Rules:
1. The user only has `6` lives
1. The same letter cannot be used to guess again
2. If a guess is correct, that letter is revealed wherever it occurs in the word
3. When all letters are revealed the user has won
4. If all lives are used the user has lost and the word is revealed
5. The word and guesses are case-insensitive

### Example input/output
The word to guess is: `test`

#### Win Scenario
||Input|Output|
|---|---|---|
|1|"z"|`____`|
|2|"e"|`_e__`|
|3|"x"|`_e__`|
|4|"t"|`te_t`|
|5|"s"|`test`|
|||`Congratulations`|

#### Lose Scenario
||Input|Output|
|---|---|---|
|1|"z"|`____`|
|2|"y"|`____`|
|3|"x"|`____`|
|4|"w"|`____`|
|5|"v"|`____`|
|6|"u"|`____`|
|||`Lost! The word was: test`|
