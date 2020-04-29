#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  int flipkart,snapdeal,amazon;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  flipkart=fa-(fa*fd/100)+fs;
  snapdeal=sa-(sa*sd/100)+ss;
  amazon=aa-(aa*ad/100)+as;
  cout<<"In Flipkart Rs."<<flipkart;
  cout<<"\nIn Snapdeal Rs."<<snapdeal;
  cout<<"\nIn Amazon Rs."<<amazon;
  if(flipkart<=snapdeal && flipkart<=amazon)
  {
    cout<<"\nHe will prefer Flipkart";
  }
  else if (snapdeal<=amazon)
  {
    cout<<"\nHe will prefer Snapdeal";
  }
  else
    cout<<"\nHe will prefer Amazon";
}