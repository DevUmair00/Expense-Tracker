import Header from '../components/dashboard/Header';
import SummaryCards from '../components/dashboard/SummaryCards';
import AnalyticsGrid from '../components/dashboard/AnalyticsGrid';

const DashboardLayout = () => {
  return (
    <div>
      <Header />
      <SummaryCards />
      <AnalyticsGrid />
    </div>
  )
}

export default DashboardLayout;
