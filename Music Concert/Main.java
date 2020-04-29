#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
int *a;
  int n,male=0,female=0;
  cin>>n;
  a=(int *)calloc(n,sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
 for(int i=0;i<n;i++)
  {
    if(*(a+i)%2==0)
      female++;
   else
     male++;
  } 
  cout<<male;
  cout<<"\n"<<female;
  
  return 0;
}