#!/bin/python3

import sys


n = int(input().strip())
if n%2 ==1:
then print("Weird")
if n%2 ==0:
    if n>=2 && n<= 5:
        print("Not Weird")
    if n>=6 && n<= 20:
        print("Weird")
    if n>2:
        print("Not Weird")
