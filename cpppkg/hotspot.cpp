#include<cstdlib>
#include<iostream>
using namespace std;
int main()
{
	system("cls");
	system("title WiFi Hotspot Switch");
	cout<<"WiFi Hotspot Switch\n(C)SwG Ghosh\n";
	cout<<"1-Enable Hotspot\n";
	cout<<"2-Disable Hotspot\n";
	cout<<"3-Hotspot Settings\n";
	char ch=' ';
	cout<<"Choice ->";
	cin>>ch;
	switch(ch)
	{
		case '1':
		system("netsh wlan start hostednetwork");
		break;
		case '2':
		system("netsh wlan stop hostednetwork");
		break;
		case '3':
		cout<<"This feature will be added soon when updates roll out."<<endl;
		break;
		default:
		cout<<endl<<"Something went wrong!"<<endl;
	}
	system("pause");
}