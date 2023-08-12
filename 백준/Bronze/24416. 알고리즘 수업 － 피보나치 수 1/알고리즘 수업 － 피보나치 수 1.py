# 24416. 알고리즘 수업 - 피보나치 수1

def fib(n):
    if n==1 or n==2:
        return 1
    else:
        return fib(n-1)+fib(n-2)
        
def fibonacci(n):
    fi=[0]*(n+1)
    fi[1],fi[2]=1,1
    cnt=0
    for i in range(3,n+1):
        cnt+=1
        fi[i]=fi[i-1]+fi[i-2]
    return cnt

n=int(input())
print(fib(n),fibonacci(n))