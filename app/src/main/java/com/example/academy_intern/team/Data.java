package com.example.academy_intern.team;

import java.util.ArrayList;

public class Data
{

    static ArrayList<Member> memberDetails = new ArrayList<>();

    public Data()
    {
        populate();
    }

    public void populate()
    {
        memberDetails = new ArrayList<>();
        Member member1 = new Member("Makgala", "Ramotsoenyane", "makgala@thedigitalacademy.co.za", "User Experience Designer", "1234");
        memberDetails.add(member1);
        Member member2 = new Member("Mnqobi", "Nsele", "mnqobi@thedigitalacademy.co.za", "Android Developer", "1234");
        memberDetails.add(member2);
        Member member3 = new Member("Regan", "Cannell", "regan@thedigitalacademy.co.za", "Spring Developer", "1234");
        memberDetails.add(member3);
        Member member4 = new Member("Teboho", "Mokalake", "teboho@thedigitalacademy.co.za", "Web Developer", "1234");
        memberDetails.add(member4);
        Member member5 = new Member("Lulamile", "Mkhungela", "lulamile@thedigitalacademy.co.za", "Android Developer", "1234");
        memberDetails.add(member5);
        Member member6 = new Member("Rrammusi", "Mokwatsi", "rrammusi@thedigitalacademy.co.za", "Android Developer", "1234");
        memberDetails.add(member6);
    }

    public static boolean verifyLogin(String email, String password)
    {
        boolean permission = false;
        for (Member loggingInMember : memberDetails)
        {
            if (email.equals(loggingInMember.getEmail()) && password.equals(loggingInMember.getPassword())) {
                permission = true;
                break;
            }
        }
        return permission;
    }

    public Member loginMember(String email, String password)
    {
        Member loggedInMember = new Member();
        for (Member loggingInMember : memberDetails)
        {
            if (email.equals(loggingInMember.getEmail()) && password.equals(loggingInMember.getPassword())) {
                loggedInMember = loggingInMember;
                break;
            }
        }
        return loggedInMember;
    }

    public Member returnMember(int n)
    {
        Member desiredMember = new Member();
        for (Member searchMember : memberDetails)
        {
            if (n <= memberDetails.size())
            {
                searchMember = memberDetails.get(n);
                desiredMember = searchMember;
            }
        }
        return desiredMember;
    }
}
