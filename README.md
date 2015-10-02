# BuzzKill
Buzz Kill is a small Android Wear application that is set to let off a distinctive buzz every 5 minutes to help user to focus.

# The Concept
This is not the first time the comcent has been brought up. Companies have actually made hardware devices based off of the 5 minute reminder: http://skreksto.re/products/durr

After hearing about it I found it to be a great idea and one that I wanted to recreate on Wear.

I often find myself losing focus and perhaps going for a "5 minute break" that turns into 45 minutes. It can be easy to slip focus like this but with a little reminder like this I feel like it can be a lot easier to stay on track.

Something as inconspicuous as a little buzz every 5 minutes is easy to zone out from when your really focused in on a task but, also just enough to pull you out of that procrastination loop you may be in.

# Upcoming updates

Unfortunately Google changed the way alarms work after KitKat(API 19) you can no longer set repeating exact alarms due to battery saving measures.
This app is very light on the battery not even needing a screen wake to vibrate.

Unfortunately there is no solid way to set exact repeating alarms on API 19+. So I will have to implement a work around. A wrapper class is going to be needed to bind the main activity with the service and loop the two.

I also want to add more features such as a pomodoro timer and customizable buzz intervals/settings.

# Screenshots

<img src="http://i.imgur.com/Ujsu7ua.png" />
