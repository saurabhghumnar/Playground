#include<iostream>
using namespace std;
int main()
{
  int n,n1,digit,temp1;
  cin>>n;
  int temp=n*n;
 n1=temp;
  while(n1>0)
  {
    digit++;
    n1=n1/10;
  }
  temp1=temp;
  int half=digit/2,lefthalf=1,right,left;
  while(half>0)
  {
    lefthalf=lefthalf*10;
    half--;
  }
  if(digit%2==0)
  {
  	left=temp1/lefthalf;
    right=temp%lefthalf;
    int newtemp=left+right;
    if(newtemp==n)
      cout<<"Kaprekar Number";
    else 
      cout<<"Not a Kaprekar Number";
  }
  else if(digit%2==1)
  {
    left=temp1/lefthalf;
    lefthalf=lefthalf*10;
    right=temp%lefthalf;
    int newtemp=left+right;
    if(newtemp==n)
      cout<<"Kaprekar Number";
    else 
      cout<<"Not a Kaprekar Number";
  }
}
