import SidebarItems from "../components/sideBar/SideBarItems";
import { ChartPie } from "lucide-react";

const Sidebar = () => {
  return (
    <aside className="hidden sm:block border-r-2 border-r-black/20 min-h-dvh">
      <div className="flex pr-5 pl-2 py-3 items-center justify-start gap-2 border-y-2 border-black/20">
        <ChartPie className="font-black size-8" />
        <span className="text-xl sm:text-2xl font-bold">ExpenseTracker</span>
      </div>

      <div className="pl-3">
        <SidebarItems />
      </div>
    </aside>
  );
};

export default Sidebar;
