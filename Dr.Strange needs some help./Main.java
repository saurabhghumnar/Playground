#include<iostream>
using namespace std;
int experiment(int,int,int);
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int flag=experiment(m,n,req);
  if(flag==0)
  	cout<<"Sorry Doctor! You need more bacteria.";
  else if(flag==1)
    cout<<"Doctor, you can proceed with your experiment.";
}
int experiment(int a,int b,int c)
{
   int temp=1;
  int tflag=1;
  for(int i=1;i<=b;i++)
  {
   
    temp=temp*a;
  }
  if(temp<c)
  {
    tflag=0;
  }
    return tflag;
}