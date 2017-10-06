#!/bin/python3

import sys
N = int(input())
if N>1:
    if N<21:
        for i in range(1,10):
            print(str(i*N))
