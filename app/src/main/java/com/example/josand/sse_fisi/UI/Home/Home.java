package com.example.josand.sse_fisi.UI.Home;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


import com.example.josand.sse_fisi.R;
import com.example.josand.sse_fisi.UI.LaboralData.LaboralDataShow;
import com.example.josand.sse_fisi.UI.PersonalData.PersonalDataShow;
import com.example.josand.sse_fisi.UI.Postgraduate.PostgraduateShow;
import com.example.josand.sse_fisi.UI.Undergraduate.UndergraduateShow;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;


public class Home extends AppCompatActivity {

    private Toolbar toolbar;
    private Context mContext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mContext = this;
        setUpToolbar();
        setUpNavDrawer();

    }

    private void setUpToolbar() {
        toolbar = findViewById(R.id.myToolbar);
        toolbar.setTitle(getString(R.string.Home));
        setSupportActionBar(toolbar);
    }


    private void setUpNavDrawer() {
        new DrawerBuilder().withActivity(this).build();

        PrimaryDrawerItem home = new PrimaryDrawerItem()
                .withIdentifier(R.string.Home)
                .withName(R.string.Home)
                .withSelectable(true)
                .withIcon(R.drawable.ic_home_black_24dp);
        PrimaryDrawerItem personalData = new PrimaryDrawerItem()
                .withIdentifier(R.string.personalData)
                .withName(R.string.personalData)
                .withSelectable(true)
                .withIcon(R.drawable.ic_account_box_black_24dp);
        PrimaryDrawerItem undergraduateData = new PrimaryDrawerItem()
                .withIdentifier(R.string.undergraduateData)
                .withName(R.string.undergraduateData)
                .withSelectable(true)
                .withIcon(R.drawable.ic_account_balance_black_24dp);
        PrimaryDrawerItem postgraduateData = new PrimaryDrawerItem()
                .withIdentifier(R.string.postgraduateData)
                .withName(R.string.postgraduateData)
                .withSelectable(true)
                .withIcon(R.drawable.ic_school_black_24dp);
        PrimaryDrawerItem laboralData = new PrimaryDrawerItem()
                .withIdentifier(R.string.laboralData)
                .withName(R.string.laboralData)
                .withSelectable(true)
                .withIcon(R.drawable.ic_work_black_24dp);
        PrimaryDrawerItem valFormation = new PrimaryDrawerItem()
                .withIdentifier(R.string.valorateFormation)
                .withName(R.string.valorateFormation)
                .withSelectable(true)
                .withIcon(R.drawable.ic_stars_black_24dp);
        PrimaryDrawerItem valService = new PrimaryDrawerItem()
                .withIdentifier(R.string.valorateService)
                .withName(R.string.valorateService)
                .withSelectable(true)
                .withIcon(R.drawable.ic_star_border_black_24dp);
        PrimaryDrawerItem about = new PrimaryDrawerItem()
                .withIdentifier(R.string.about)
                .withName(R.string.about)
                .withSelectable(true)
                .withIcon(R.drawable.ic_info_black_24dp);
        PrimaryDrawerItem logout = new PrimaryDrawerItem()
                .withIdentifier(R.string.logout)
                .withName(R.string.logout)
                .withSelectable(true)
                .withIcon(R.drawable.ic_power_settings_new_black_24dp);

        AccountHeader accountHeader = new AccountHeaderBuilder().withActivity(this)
                .withHeaderBackground(R.drawable.accoutheader)
                .addProfiles(
                        new ProfileDrawerItem().withName(getString(R.string.user))
                                .withEmail(getString(R.string.major))
                                .withIcon(R.drawable.juan)
                ).withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean current) {
                        return false;
                    }
                }).build();

        Drawer result = new DrawerBuilder().withActivity(this).withToolbar(toolbar)
                .addDrawerItems(home,personalData,undergraduateData,postgraduateData,
                        laboralData,valFormation,valService,about,logout)
                .withAccountHeader(accountHeader)
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        switch (position){
                            case 1: break;
                            case 2:
                                Intent intentPD = new Intent(mContext,PersonalDataShow.class);
                                startActivity(intentPD);
                                break;
                            case 3:
                                Intent intentU = new Intent(mContext,UndergraduateShow.class);
                                startActivity(intentU);
                                break;
                            case 4:
                                Intent intentP = new Intent(mContext,PostgraduateShow.class);
                                startActivity(intentP);
                                break;
                            case 5:
                                Intent intentL = new Intent(mContext,LaboralDataShow.class);
                                startActivity(intentL);
                                break;
                            case 6: break;
                            case 7: break;
                            case 8: break;
                            case 9: break;
                            default:break;
                        }
                        return false;
                    }
                }).build();
    }

}
