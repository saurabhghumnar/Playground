#include<iostream>
#include<math.h>
using namespace std;
int main()
{

 int balls,run,cur,ballnow;
 cin>>balls>>run>>cur>>ballnow;
 float totover=(balls/6)+(0.1*(balls%6));
 float curover=(ballnow/6)+(0.1*(ballnow%6));
 float curate=cur/curover;
 
 float totrate=run/totover;
 cout<<totover<<"\n";
 cout<<curover<<"\n";
 cout<<round(curate*10)/10<<"\n";
 cout<<round(totrate*10)/10<<"\n";
 if(curate>totrate)
   cout<<"Eligible to Win";
  else 
    cout<<"Not Eligible to Win";
 
}