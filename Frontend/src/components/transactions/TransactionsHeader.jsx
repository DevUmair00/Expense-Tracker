import { Plus } from "lucide-react";

const TransactionsHeader = () => {
  return (
    <div className="flex flex-col sm:flex-row items-start sm:items-center justify-between pt-8 gap-8">
      <div>
        <h1 className="text-2xl sm:text-3xl font-bold py-2">Transactions</h1>
        <p className="line-clamp-1">Manage all your income and expenses in one place.</p>
      </div>

      <button className="rounded-xl px-6 py-2 bg-black text-white font-bold flex items-center justify-center gap-2 self-end sm:self-auto">
        <Plus className="font-bold" /> 
        <span className="line-clamp-1 text-sm sm:text-lg">Add Transaction </span>
      </button>
    </div>
  );
};

export default TransactionsHeader



