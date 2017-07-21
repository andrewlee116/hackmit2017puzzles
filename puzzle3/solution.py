#converts a word in any "format" (ex: "Radio:", "ad{}3-") into lowercase w/ no symbols (ex: "radio", "ad3")
def normalize(word):
	wurd_list = list(word.lower())
	for leta in word:
		if(not leta.isalnum()):
			del wurd_list[wurd_list.index(leta)]
	return ''.join(wurd_list)

def hasNumbers(inputString):
	return any(char.isdigit() for char in inputString)

script = open('bttf_script.txt','r')

answer_list = []
temp_unique = []
total_unique = []
phrase = "the github of travel but like godaddy"

while(len(answer_list)<len(phrase)):
	stuff = script.readline().lower().strip().split()
	for word in stuff:
		if(hasNumbers(word)):
			continue
		wurd = normalize(word)
		if(not wurd.isalpha()):
			continue
		if(wurd not in total_unique):
			total_unique.append(wurd)
			temp_unique.append(wurd)
			if(len(temp_unique)==32):
				answer_list.append(temp_unique[alphabet.index(phrase[len(answer_list)])])
				temp_unique = []

print("The answer is %s" % (' '.join(answer_list)))
script.close()
