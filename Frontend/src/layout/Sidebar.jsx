import SidebarItems from "../components/sideBar/SidebarItems";
import { ChartPie } from "lucide-react";

const Sidebar = () => {
  return (
    <aside className="fixed left-0 top-0 border-r-2 border-black/20 min-h-dvh min-w-[15rem]">
  
      {/* Logo */}
      <div className="flex items-center max-h-16 gap-2 border-y-2 border-black/20 pl-2 p-4">
        <ChartPie className="size-8 text-black/50" />

        <span className="text-lg sm:text-xl font-bold">
          ExpenseTracker
        </span>
      </div>

      {/* Navigation */}
      <div className="">
        <SidebarItems />
      </div>

    </aside>
  );
};

export default Sidebar;




