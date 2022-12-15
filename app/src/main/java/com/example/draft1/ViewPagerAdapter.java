package com.example.draft1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.draft1.fragments.ConnectFragment;
import com.example.draft1.fragments.CreateFragment;
import com.example.draft1.fragments.MessagesFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 1){
            return new CreateFragment();
        }else if (position == 0){
            return new ConnectFragment();
        }else if (position == 2){
            return new MessagesFragment();
        }else{
            return new CreateFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
