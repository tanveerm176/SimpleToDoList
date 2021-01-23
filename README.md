# Pre-work - *My Simple ToDo List*

**My Simple ToDo List** is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: **Muhammad Tanveer**

Time spent: **6** hours spent in total

## User Stories

The following **required** functionality is completed:

* [X] User can **successfully add and remove items** from the todo list
* [X] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [X] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [ ] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://github.com/tanveerm176/SimpleToDoList/blob/master/gifs/ToDoList_VideoWalkthrough.gif' title=' To Do List Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:** Although the instructions were easy to follow for the pre work, I did have some difficulty configuring and understanding the layout of the Android app development platform. The organization of the important files and how they interacted with each other was not intuitive and required some outside references to fully understand. However after some light research I was able to figure it out. The code itself was mostly self explanatory and allowed me to understand the inner workings of the app itself and the implmentation also allows easy modifications and personalization to the app. I thin for future pre works, some of the instructions should be expanded upon and the students should be taught how to build and run the application. In addition, the slides display an older version of Android Studio which can cause some confusion for students following the slides.

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:** ArrayAdapter is used to anytime we need to create a list of scrollable items, the ArrayAdapter converts the items populated in the ArrayList into a ListView. The Adapter is important to be able to seemlessly transition from the data the user inputs to the viewing experience for the user while allowing any data to be processed or modified if needed. The getView method is the main part of the ArrayAdapter, it take sin 3 parameters: position, convertView, and parent. The getView takes the position of the item needed to be viewed by the user and displays it on a new View. The convertView parameter is used when an old view needs to be saved such in the case of the user scrolling a list, it can also be used to recycle old views that are not being used. It helps to optimize performance by recycling items that are not currently being dispalyed/used. 

## Notes

The slides for the android pre work were a bit hard to follow since they use an older version of the Android Studio porgram. However aside from that this pre work really helped me get a good foundation for Android web development. 

## License

    Copyright [2021] [Muhammad Tanveer]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
