public class DiffInDays {

    int[] daysInMonth = new int[]{31
            , 28
            , 31
            , 30
            , 31
            , 30
            , 31
            , 31
            , 30
            , 31
            , 30
            , 31};

    public int diff(int sYear, int sMonth, int sDay, int eYear, int eMonth, int eDay) {
        int totalDays;

        int daysToEndOfMonth = 0;
        if (sMonth == eMonth && sYear == eYear) {
            daysToEndOfMonth = eDay - sDay;
        } else if (sMonth < eMonth) {
            daysToEndOfMonth = daysInMonth[sMonth - 1] - sDay;
        }

        int daysToEndOfYear = 0;
        if (sYear < eYear) {
            for (int curMonth = sMonth + 1; curMonth <= 12; curMonth++) {
                daysToEndOfYear = daysToEndOfYear + daysInMonth[curMonth - 1];
            }
        }

        int fullYears = 0;
        for (int curYear = sYear; curYear < eYear - 1; curYear++) {
            fullYears = fullYears + 365;
        }

        int monthDaysToEndMonth = 0;
        int daysInLastPartialMonth = 0;
        for (int curMonth = 1; curMonth <= eMonth; curMonth++) {
            monthDaysToEndMonth = monthDaysToEndMonth + daysInMonth[curMonth - 1];
        }
        daysInLastPartialMonth = daysInMonth[eMonth - 1] - sDay;

        System.out.println(daysToEndOfMonth + ", " + daysToEndOfYear + ", " + fullYears + ", " + monthDaysToEndMonth + ", " + daysInLastPartialMonth);
        totalDays = daysToEndOfMonth + daysToEndOfYear + fullYears + monthDaysToEndMonth + daysInLastPartialMonth;
        return totalDays;
    }

    public int diff2(int sYear, int sMonth, int sDay, int eYear, int eMonth, int eDay) {

        int sameMonthCase = 0;
        int leadPartialMonth = 0;
        int tailPartialMonths = 0;
        int fullYear = 0;
        int fullMonths = 0;

        if (sYear == eYear)  {
            if (sMonth == eMonth) {
                sameMonthCase = eDay - sDay;
            } else {
                leadPartialMonth = daysInMonth[sMonth - 1] - sDay;
                tailPartialMonths = eDay;
                for (int cMonth = sMonth + 1; cMonth < eMonth; cMonth++) {
                    fullMonths = fullMonths + daysInMonth[cMonth - 1];
                }
            }
        } else {
            int cYear = sYear;
            while (cYear < eYear) {
                for (int cMonth = sMonth + 1; cMonth <= 12; cMonth++) {
                    fullYear = fullYear + daysInMonth[cMonth - 1];
                }
                cYear++;
            }
            leadPartialMonth = daysInMonth[sMonth - 1] - sDay;
            tailPartialMonths = eDay;

            if (sYear < cYear) {
                for (int cMonth = 1; cMonth < eMonth; cMonth++) {
                    fullMonths = fullMonths + daysInMonth[cMonth - 1];
                }
            }
        }

        int total = sameMonthCase + leadPartialMonth + fullMonths + tailPartialMonths + fullYear;
        return total;

    }


}
