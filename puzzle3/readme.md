# Step 1: Figuring out the Encoding
We are to transfer a message from present to past. However, there is a real complex way that our message gets jumbled and processed before it reaches the end. I couldn't figure this encoding/decoding method out until the solutions were released. The way messages are encoded and decoded is pretty insane:

First, take the script of "Back To The Future". Consider all the unique words (in order) in the entire script and put them in groups of 32 words. In each group, the index of each word corresponds to a letter of the alphabet (for words 1-26) or to a space (27th word). The remaining words (28 to 32) result in an error and nothing is outputted. So for example, the second word in this group might output "b". Now, for encoding any message, the ith letter of our message is encoded by looking at the ith group of 32 words and whatever the index of out letter is, we put the unique word corresponding to that index.

The file solution.py basically does just that and we get the answer in answer.txt. Note that the answer was different for everyone (the phrase I had to encode was "the github of travel but like godaddy"). 
