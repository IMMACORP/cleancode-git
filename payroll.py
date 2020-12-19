import pandas as pd
from datetime import datetime

csvFile = 'employee.csv'

try:
    employees = pd.read_csv(csvFile)
except IOError:
    print("Error: can\'t find " + csvFile)
    sys.exit(1)

# Test data frame
# df_employees = pd.DataFrame([['DoVanA', '19890101','dev','20160101',5000000], ['DoVanB', '19740101','dev','20040101',3000000]],
#     index=['person1', 'person2'],
#     columns=['name', 'dob','role','startdate','startsal'])

SALARY_RATE = 1.06


# convert string to date
def convert_string_to_date(str):
    date = str[:4] + "-" + str[4:6] + "-" + str[6:]
    formatedDate = datetime.strptime(date, '%Y-%m-%d').date()
    return formatedDate


# calculate age of employee
def calculate_year(date):
    today = datetime.today()
    age = today.year - date.year - ((today.month, today.day) < (date.month, date.day))
    return age


# calculate worked years
def calculate_years_months(startdate):
    today = datetime.today()
    isSmallerMonthDay = ((today.month, today.day) < (startdate.month, startdate.day))
    year = today.year - startdate.year - isSmallerMonthDay
    # 2018/11/01 - 2018/12/21
    # 2018/11/01 - 2019/01/21
    if isSmallerMonthDay:
        month = today.month + 12 - startdate.month
    else:
        month = today.month - startdate.month
    return str(year) + " năm, " + str(month) + " tháng"


# calculate salary
def calculate_salary(startDate, startsal, salaryrate):
    expierencedYear = calculate_year(startDate)
    return '{:20,.0f}'.format(int(startsal) * salaryrate ** expierencedYear)


# additional columns for result
ages = []
workedYears = []
salaries = []

for index, row in df_employees.iterrows():
    dob = convert_string_to_date(row['dob'])
    startdate = convert_string_to_date(row['startdate'])

    # add to age column
    age = calculate_year(dob)
    ages.append(age)

    # add to workedYear column
    workedYear = calculate_years_months(startdate)
    workedYears.append(workedYear)

    # add to salary column
    salary = calculate_salary(startdate, row['startsal'], SALARY_RATE)
    salaries.append(salary)

df_employees['ages'] = ages
df_employees['workedYears'] = workedYears
df_employees['salaries'] = salaries
