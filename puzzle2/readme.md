# Step 1: Login
Opening puzzle 2, we are greeted with a login screen. A choice of 2 usernames (Marty Mcfly, Biff Tannen) and a password field which accepts 6-12 alphanumeric characters I believe. Other than pure brute force, I didn't have much of an idea of how to solve this in a smarter way. However, there were many hints along the way that led me to a smarter solution.

Firstly, the page of the puzzle had some text like "NEW SERVER UPGRADES: Now we use new PENTIUM CHIPS" or something like that. After looking up these said Pentium chips, I found that they were produced around 1995 to 1998. Hmmm. Secondly, there were hints on the Slack page about "using headers to your advantage". Thirdly, the source code contained a comment containing something like "terminates early if a[i] != b[i]". What would this all lead to?

# Step 1.5: Timing Attack
It seemed that all these hints pointed us towards a method of cracking a password through a timing attack, a security exploit that analyzes the amount of time taken to execute certain algorithms. In our case, this refers to the way that the system checks our input (password attempt) by matching it with the actual password. The method for checking the password is simulated so that the checking stops at the first incorrect character. This means that for each correct character, there is a noticeable time difference. In our case, this time difference turns out to be 0.5 seconds for every correct character.

The hint about "headers" came into play when I looked at the response headers for putting in a password and noticed one called "X-Upstream-Response-Time". This gave us exactly the information we needed, which was the time it took for our password to get processed. Initially, there would be 0.01 seconds when putting in any incorrect password, but if we put in a password where only the first character is correct, the "X-Upstream-Response-Time" header would have a value of 0.51. If our password starts off with 2 correct characters, then we get 1.01. And so on.

The solution.py implementation uses the requests module and reads this header value. I basically used brute force but terminated at each character if we saw that there was this sudden jump in "X-Upstream-Response-Time". By doing so, each password took roughly 10 minutes to crack.

# Step 2: HackCoin
Want the solution to the puzzle? You need 1000 HackCoin!

Current Balance: 50 HackCoin (for both Marty and Biff)

We are also given a button that says "Transfer" which simply transfers our money between Biff and Marty.

So we need to generate money somehow since our total balance can only add up to 100. It turns out that after hours and hours of overthinking, all we had to do was click "Transfer" multiple times before the page processed again... Doing this and logging into the other account would result in more than 100 HackCoin. This concept seems to be called a "Race Condition" and is described more in detail in the official Medium post by HACKMIT which describes all the solutions. 
