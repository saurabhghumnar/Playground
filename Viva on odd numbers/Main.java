#include<iostream>
using namespace std;
int main()
{
  int a[10],pass=0,i=0;
  float score=0.0;
  //for(int i=0;i<10;i++)
  while(pass<3)
  {
   cin>>a[i];
    if(a[i]>=0 && a[i]%2==1 && pass<3)
    {
      score=score+1.0;
      pass++;
      if(pass==3)
        break;
    }
    else if(a[i]>=0 && a[i]%2==0 && pass<3)
    {
     score=score-0.5; 
      if(pass==3)
        break;
    }
    else if(a[i]<0)
    {
      score=score-1.0;
     pass=3;
      break;
    }  
  }
cout<<score;
}