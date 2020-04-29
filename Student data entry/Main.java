#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct student s1;
  gets(s1.name);
  cin>>s1.roll;
  cin>>s1.marks;
  cout<<endl;
  std::cout<<"Student Details";
  std::cout<<"\nName: "<<s1.name;
  std::cout<<"\nRoll: "<<s1.roll;
  std::cout<<"\nMarks: "<<s1.marks;
}
