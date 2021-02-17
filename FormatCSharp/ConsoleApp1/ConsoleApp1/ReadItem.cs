﻿using System;
using System.IO;


namespace ConsoleApp1
{
    internal class ReadItem
    {
        internal void checkList(TextReader trIn, TextWriter trOut)
        {

            //Console.WriteLine(trIn.ReadToEnd());


            
            String encabezado = "o;?STUD_ID|CPNT_TYP_ID|CPNT_ID|REV_DTE|CMPL_STAT_ID|COMPL_DTE|COMPL_DTE_TIMEZONE|LST_UPD_USR|GRADE|REV_NUM|CREDIT_HRS|CPE_HRS|CONTACT_HRS|TOTAL_HRS|INST_N:00 AME|COMMENTS|ES_USER_N:00 AME|ESIG_MEANING_CODE_ID|ESIG_MESSAGE|SCHD_ID|INCLUDE_IN_GOVT_REPORTING|PROGR:00 AM1_2483_ID|PROGR:00 AM1_HRS|PROGR:00 AM1_TRAINING_FUNDING_ID|PROGR:00 AM1_HOURS_DURING_WORK|HOURS_OUTSIDE_OF_WORK|PROGR:00 AM2_2483_ID|PROGR:00 AM2_HRS|PROGR:00 AM2_TRAINING_FUNDING_ID|PROGR:00 AM2_HOURS_DURING_WORK|PROGR:00 AM2_HOURS_OUTSIDE_OF_WORK|PROGR:00 AM3_2483_ID|PROGR:00 AM3_HRS|PROGR:00 AM3_TRAINING_FUNDING_ID|PROGR:00 AM3_HOURS_DURING_WORK|PROGR:00 AM3_HOURS_OUTSIDE_OF_WORK|HOURLY_RATE|HOURLY_RATE_CURRENCY|LGL_ENTITY_2483_ID|EMP_CLASS_2483_ID|TRAINING_ACTION_CATEGORY_ID|TRAINING_PURPOSE_ID|ADJUSTED_HOURLY_RATE|ADJUSTED_HOURLY_RATE_CURRENCY|!##!";
            trOut.WriteLine(encabezado);
            trOut.WriteLine(trIn.ReadToEnd());



            trIn.Close();
            trOut.Close();


        }
    }
}