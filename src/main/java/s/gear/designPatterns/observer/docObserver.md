observer :
# behavioral design patten
# one-to-many(subject-to-observers)
# subject changes == notify observes -> react

## Problem

## Solution

## use case



Publisher:
    - have list of  Subscriber
    - 3 methods :
        -> subscribe : add subscriber
        -> unsubscribe : remove subscriber
        -> notify : send notification to that subscriber
            using that update()



Subscriber:
    - must be interface that  have method update()
    - every class one to do subscription implement that interface



editor : define that action to by notify