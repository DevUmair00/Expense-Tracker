import Header from '../components/dashboard/Header';
import SummaryCards from '../components/dashboard/SummaryCards';
import AnalyticsGrid from '../components/dashboard/AnalyticsGrid';

const DashboardLayout = () => {
  return (
    <div className='ml-[15rem] px-4'>
      <Header />
      <SummaryCards />
      <AnalyticsGrid />
    </div>
  )
}

export default DashboardLayout;


