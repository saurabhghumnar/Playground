#include<iostream>
#include<cstdlib>
using namespace std;

struct complex
{
  int f;
  float i;
};

int main()
{
int n;
  cin>>n;
  complex c1,c2,ans;
  cin>>c1.f;
  cin>>c1.i;
  cin>>c2.f;
  cin>>c2.i;
  switch(n)
  {
    case 1:
       ans.f=c1.f+c2.f;
  		ans.i=c1.i+c2.i;
      if(ans.i<0)
        cout<<ans.f<<ans.i<<"i";
      else
        cout<<ans.f<<"+"<<ans.i<<"i";
       break;
      
    case 2:
       ans.f=c1.f-c2.f;
  		ans.i=c1.i-c2.i;
      if(ans.i<0)
        cout<<ans.f<<ans.i<<"i";
      else
        cout<<ans.f<<"+"<<ans.i<<"i";
     
      break;
      
    case 3:
      ans.f=(c1.f*c2.f)-(c1.i*c2.i);
  		ans.i=(c1.f*c2.i)+(c2.i*c1.i);
      
  		
      if(ans.i<0)
        cout<<ans.f<<ans.i<<"i";
      else
        cout<<ans.f<<"+"<<ans.i<<"i";
        break;
      
    default:
      cout<<"Invalid choice";
  }
}
