# MKS21X-FinalProject
Dev Log
--------------------------------------------------------------------------------
January 3, 2018
- Today we just lied down a foundation to work on. Connor experimented with
branching and Nathan just transferred what we had in our UML diagram to code.


--------------------------------------------------------------------------------
January 4, 2018
-Nathan experimented with the format of the board. Looked at the setup from the
WordSearch lab and used that to print out the board. Nathan then found a way to
label the squares using two axes.

--------------------------------------------------------------------------------
January 5, 2018
- Went over our UML diagram and started questioning its efficiency.  We
had a very long discussion over Messenger and bounced ideas off of each other.
It was a very productive conversation because neither of us were left offended,
instead, we were able to develop a deeper understanding about out project.
--------------------------------------------------------------------------------
January 6, 2018
Nathan tried to visualize what we had discussed about having each piece as a
subclass of a class named Piece. We developed questions to ask Mr. K: "Should we
have an array of pieces or an array of Strings?" and "How do we edit/save files"

--------------------------------------------------------------------------------
January 8, 2017
Connor:
Worked on began to code the Chessboard class with the UML diagram as a template

Nathan:
Worked on and finished the Square class as seen in the UML diagram

Both:
We went to the CSDojo to get more face to face planning and we came up with how
the pieces will make their possible move lists and decided that it will generate
its own 2D array of Strings that will hold the places where the piece can curre-
ntly move. It will then send it to the chessboard class and the chessboard will
look at the actual chessboard and give the actual possible moves. The making of
the 2d array strings will be done by for loops that will loop based on the dire-
ction the pieces can move. We also decided that the save file will just save a
chessboard in it with the pieces in it.
--------------------------------------------------------------------------------
January 9, 2018
Connor:
Designing chessboard methods and how the chess board will work with Lanturna.
Also fixed class pieces.

Nathan:
Continued making the possible moves list for all of the pieces.

--------------------------------------------------------------------------------
January 10, 2018

Both:
We worked through our code together in class.  Got the 2d array of possible
moves to print out correctly and fixed bugs with the possible moves list.  We
went to CS Dojo to study ad also to ask how we will make the pieces move or
insert a text box in order for the player to insert their move.  We texted
Timothy So and we discussed that we will use Screen in order to display our game
so it update once we move and not every second like terminal.

Connor:
Made it so the pieces kind of moved, only the king moved properly (but hey,
that's a start!). Did this by writing a limitmoves function that took the
possible move list, and the given piece and made it return the moves that it
could do, due to the pieces surrounding it.

--------------------------------------------------------------------------------
January 11, 2018

Both:
We did the style where one of us coded (Connor), while another one (Nathan) told
him what to code and if he made any errors. We skpyed on messenger for like two
hours. We completed a lot and fixed the bugs in our code to accomplish moving
pieces including all of their restrictions.

Nathan:
Coded a rough check method.

--------------------------------------------------------------------------------
January 12, 2018
Both:
We yet again did one person typing(Connor) and one person editing(Nathan). We
refined the check methods and made a successful check system. We also added kn-
ight moves to the limit method. We then realized that move was actually counter
acting the limit method by using the update all method in the wrong placed. This
allowed us to finally make somewhat of a working game in our driver.

Connor:
Coded the saveGame, newGame, and loadGame methods which successfully made the
save system as promised in our proposal. 
--------------------------------------------------------------------------------
January 13, 2018
Both: We set up our demo presentation and planned how we would present.
We did a practice presentation and assigned parts of the presentation to each 
other.  Realized that the limit function wasn't working properly so we fixed 
that.
--------------------------------------------------------------------------------
